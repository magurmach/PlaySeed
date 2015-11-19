package controllers;

import play.mvc.Controller;
import play.mvc.Result;

public class Home extends Controller{
	public static Result index()
	{
		return ok(views.html.ACLhome.render());
	}
	public static Result javaCourse()
	{
		return ok(views.html.javacourse.render());
	}
	public static Result officeCourse()
	{
		return ok(views.html.javacourse.render());
	}
	public static Result ccnaCourse()
	{
		return ok(views.html.javacourse.render());
	}
	public static Result graphicsCourse()
	{
		return ok(views.html.javacourse.render());
	}
	public static Result basicCourse()
	{
		return ok(views.html.javacourse.render());
	}
	public static Result mcseCourse()
	{
		return ok(views.html.mcsecourse.render());
	}
}