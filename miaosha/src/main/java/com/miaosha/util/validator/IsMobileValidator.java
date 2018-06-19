package com.miaosha.util.validator;

import com.miaosha.util.IsMobile;
import org.apache.commons.lang3.StringUtils;
import sun.awt.SunHints;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/***
 *
 * 后台验证规则框架
 * @author zhangwei
 * @Date 2018-06-19
 */
public class IsMobileValidator  implements ConstraintValidator<IsMobile,String> {

    private  boolean required;

    @Override
    public void initialize(IsMobile constraintAnnotation) {
            required = constraintAnnotation.required();
    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        if(required){
            return ValidatorUtil.isMobile(value);
        }else{
            if(StringUtils.isEmpty(value)){
                return true;
            }else{
                return ValidatorUtil.isMobile(value);
            }
        }

    }
}
