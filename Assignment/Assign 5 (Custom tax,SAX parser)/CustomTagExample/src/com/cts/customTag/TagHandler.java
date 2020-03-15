package com.cts.customTag;

import java.util.Date;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;
import org.apache.jasper.runtime.JspWriterImpl;

public class TagHandler extends TagSupport {
	@Override
	public int doStartTag() throws JspException {
		System.out.println("from doStartTag()");
		JspWriter out = pageContext.getOut();
		try {
			out.write("<h1>" + new Date() + "</h1>");
		} catch (Exception e) {
			// TODO: handle exception
		}
		return EVAL_BODY_INCLUDE;
//		return SKIP_BODY;
	}

	@Override
	public int doEndTag() throws JspException {
		System.out.println("from doEndTag()");
		return SKIP_PAGE;
		// return EVAL_PAGE;

	}
}
