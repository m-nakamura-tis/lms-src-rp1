package jp.co.sss.lms.util;


import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

@Target({ java.lang.annotation.ElementType.TYPE })
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Constraint(validatedBy = {AttendanceValidator.class})
public @interface StudentAttendance {
	String message() default "";
	
	 Class<?>[] groups() default {}; 
	 
	 Class<? extends Payload>[] payload() default {};
	 
	 String fieldAttendanceList() default "attendanceList";

}
