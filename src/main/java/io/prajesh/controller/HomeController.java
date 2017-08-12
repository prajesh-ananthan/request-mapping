package io.prajesh.controller;

import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

/**
 * @author Prajesh Ananthan
 *         Created on 12/8/2017.
 */
@RestController
@RequestMapping("/home")
public class HomeController {

  /**
   * Request mapping with method
   */
  @RequestMapping(value = "/method0")
  public String method0() {
    return "method0";
  }

  /**
   * Request mapping with multiple URI
   */
  @RequestMapping(value = {"/method1", "/method1/second"})
  public String method1() {
    return "method1 with multiple uri";
  }

  /**
   * Request mapping with multiple HTTP method
   */
  @RequestMapping(value = "/method2", method = {RequestMethod.GET, RequestMethod.POST})
  public String method2(HttpServletRequest request) {
    if (request.getMethod().equals("POST")) {
      return "POST: method2 with mutiple http methods";
    }
    return "GET: method2 with multiple http methods";
  }

  /**
   * Request mapping with headers
   */
  @RequestMapping(value = "/method3", headers = "name=prajesh")
  public String method3() {
    return "method3 with headers";
  }

  /**
   * RequestMapping to handle dynamic URI with @Pathvariables (regex)
   *
   * @param id
   * @param name
   * @return
   */
  // TODO: Fix this
  @RequestMapping(value = "/method4/{id:[\\\\d]+}/{name}")
  public String method4(@PathVariable(name = "id") String id, @PathVariable(name = "name") String name) {
    return "@Pathvariable | method4 with id= " + id + " and name=" + name;
  }

  /**
   * RequestMapping with RequestParam
   * Example URL: http://localhost:9090/SpringRequestMappingExample/home/method9?id=20"
   *
   * @param id
   * @return
   */
  @RequestMapping(value = "/method5")
  public String method9(@RequestParam("id") int id) {
    return "@RequestParam | method5 with id= " + id;
  }

  /**
   * @return
   * @RequestMapping with Produces and Consumes: We can use header Content-Type
   * and Accept to find out request contents and what is the mime message it wants in response.
   * <p>
   * For clarity, @RequestMapping provides produces and consumes variables where we can specify
   * the request content-type for which method will be invoked and the response content type.
   */
  @RequestMapping(value = "/method6", produces = {"application/json", "application/xml"}, consumes = "text/html")
  public String method6() {
    return "method6 with produces=json and xml with consume=html";
  }
}
