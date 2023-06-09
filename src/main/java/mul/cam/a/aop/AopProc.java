package mul.cam.a.aop;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import mul.cam.a.dto.UserDto;

/*
	AOP(Aspect Oriented Programming) 관점지향
	목적 : 감시자
*/
@Aspect
public class AopProc {
	
	@Around("within(mul.cam.a.controller.*) or within(mul.cam.a.dao.*.*)")
	public Object loggerAop(ProceedingJoinPoint joinpoint) throws Throwable {
		
		HttpServletRequest request = ((ServletRequestAttributes)RequestContextHolder.currentRequestAttributes()).getRequest();
		if(request != null) {
			HttpSession session = request.getSession();
			UserDto login = (UserDto)session.getAttribute("login");

		}
		
		
		
		// logger
		String signatureStr = joinpoint.getSignature().toShortString();

		try {
			Object obj = joinpoint.proceed();  // 실행시			
			System.out.println("AOP log:" + signatureStr + " 메소드 실행 " + new Date());
			
			return obj;			
		}finally {
		//	System.out.println("실행후:" + System.currentTimeMillis());
		}
	}

}





