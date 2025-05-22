package mypack;

import java.io.IOException;

import jakarta.servlet.jsp.JspException;
import jakarta.servlet.jsp.JspWriter;
import jakarta.servlet.jsp.tagext.SimpleTagSupport;

public class Details extends SimpleTagSupport{

	@Override
	public void doTag() throws IOException, JspException
	{
		super.doTag();
		JspWriter out = getJspContext().getOut();
		out.println("This is my own Custom Tag");
	}
}
