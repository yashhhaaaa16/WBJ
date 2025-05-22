package mypack;

import java.io.IOException;
import java.io.StringWriter;

import jakarta.servlet.jsp.JspException;
import jakarta.servlet.jsp.JspWriter;
import jakarta.servlet.jsp.tagext.SimpleTagSupport;

public class Convert extends SimpleTagSupport{

	StringWriter sw = new StringWriter();
	
	@Override
	public void doTag() throws JspException, IOException
	{
		super.doTag();
		getJspBody().invoke(sw);
		JspWriter out = getJspContext().getOut();
		out.println(sw.toString().toUpperCase());
	}
}
