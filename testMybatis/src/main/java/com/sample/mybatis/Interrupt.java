package com.sample.mybatis;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect // 공통프로그램
@Component // 빈
public class Interrupt {

	private static Logger logger = LoggerFactory.getLogger(Interrupt.class);

	@Before("execution(* com.sample.mybatis.UserController.loginAction(..))")
	public void before_login(JoinPoint point) {

		logger.info("◆◆◆◆◆◆◆◆◆◆");
		logger.info(" before advice ");
		logger.info("◆◆◆◆◆◆◆◆◆◆");

		Object[] args = point.getArgs();// 매개변수의 정보 가져옴

		for (Object obj : args) {

			if (obj instanceof UserVO) {

				logger.info("비밀번호 : " + ((UserVO) obj).getUser_pwd());

			}
		}
	}
}