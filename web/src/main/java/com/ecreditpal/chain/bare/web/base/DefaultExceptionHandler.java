package com.ecreditpal.chain.bare.web.base;

import com.ecreditpal.chain.bare.biz.base.Result;
import com.ecreditpal.chain.bare.common.serialize.JsonUtil;
import com.ecreditpal.chain.bare.model.exception.CustomException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author lifeng
 * @version 2.0 on 16/10/11.
 */
@Slf4j
@Component
public class DefaultExceptionHandler implements HandlerExceptionResolver {
    @Override
    public ModelAndView resolveException(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) {
        if (e != null) {
            String msg = null;
            httpServletResponse.setCharacterEncoding("UTF-8");
            httpServletResponse.setContentType("application/json;charset=UTF-8");
            try (PrintWriter writer = httpServletResponse.getWriter();) {
                if (e instanceof CustomException) {
                    CustomException customException = (CustomException) e;
                    httpServletResponse.setStatus(500);
                    msg = JsonUtil.toJson(Result.wrapErrorResult(customException.getCode(), customException.getMessage()));
                    log.error("系统出错", customException);
                } else if (e instanceof NullPointerException) {
                    msg = JsonUtil.toJson(Result.wrapErrorResult("-1", "空指针异常"));
                    log.error("MegaExceptionHandler:", e);
                } else {
                    msg = JsonUtil.toJson(Result.wrapErrorResult("666", "程序异常"));
                    log.error("MegaExceptionHandler:", e);
                }
                writer.write(msg == null ? "message is null" : msg);
                writer.flush();
            } catch (IOException e1) {
                log.error("异常信息拦截返回异常", e);
            }
        }
        return null;
    }
}
