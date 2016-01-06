import java.util.HashMap;

import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;

import static spark.Spark.*;

public class App {
  public static void main(String[] args) {
    staticFileLocation("/public");
    String layout = "templates/layout.vtl";

    get("/", (request, response) -> {
      HashMap model = new HashMap();
      model.put("template", "templates/index.vtl");
      return new ModelAndView(model, layout);
     }, new VelocityTemplateEngine());

     get("/tour_dates", (request, response) -> {
       HashMap model = new HashMap();

       model.put("template", "templates/tour_dates.vtl");
       return new ModelAndView(model, layout);
     }, new VelocityTemplateEngine());

     get("/tickets", (request, response) -> {
       HashMap model = new HashMap();
       model.put("show-date", request.queryParams("show-date"));
       model.put("email", request.queryParams("email"));
       model.put("name", request.queryParams("name"));
       model.put("address", request.queryParams("address"));
       model.put("city", request.queryParams("city"));
       model.put("state", request.queryParams("state"));
       model.put("code", request.queryParams("code"));
       model.put("country", request.queryParams("country"));
       model.put("credit", request.queryParams("credit"));
       model.put("expiration", request.queryParams("expiration"));
       model.put("cvv", request.queryParams("cvv"));
       model.put("bill-name", request.queryParams("bill-name"));
       model.put("bill-address", request.queryParams("bill-address"));
       model.put("bill-city", request.queryParams("bill-city"));
       model.put("bill-state", request.queryParams("bill-state"));
       model.put("bill-code", request.queryParams("bill-code"));
       model.put("bill-country", request.queryParams("bill-country"));

       model.put("template", "templates/tickets.vtl");
       return new ModelAndView(model, layout);
     }, new VelocityTemplateEngine());

     get("/kurt_cobain", (request, response) -> {
       HashMap model = new HashMap();
       model.put("template", "templates/kurt_cobain.vtl");
       return new ModelAndView(model, layout);
     }, new VelocityTemplateEngine());

     get("/krist_novoselic", (request, response) -> {
       HashMap model = new HashMap();
       model.put("template", "templates/krist_novoselic.vtl");
       return new ModelAndView(model, layout);
     }, new VelocityTemplateEngine());

     get("/dave_grohl", (request, response) -> {
       HashMap model = new HashMap();
       model.put("template", "templates/dave_grohl.vtl");
       return new ModelAndView(model, layout);
     }, new VelocityTemplateEngine());
  }
}
