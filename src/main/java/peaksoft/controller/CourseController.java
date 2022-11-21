package peaksoft.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import peaksoft.model.Course;
import peaksoft.service.CourseService;

@Controller
@RequestMapping
public class CourseController {

    private final CourseService courseService;

    @Autowired
    public CourseController(CourseService courseService) {
        this.courseService = courseService;
    }

    @GetMapping("/courses/{id}")
    public String getAllCourses(@PathVariable Long id, Model model) {
        model.addAttribute("courses", courseService.getAllCourses());
        model.addAttribute("companyId",id);
        return "/course/courses";
    }

    @GetMapping("/courses/{id}/addCourse")
    public String addCourse(@PathVariable Long id, Model model) {
        model.addAttribute("course", new Course());
        model.addAttribute("companyId", id);
        return "/course/addCourse";


    }
    @PostMapping("/{id}/saveCourse")

    public String saveCourse(@ModelAttribute ("course") Course course,@PathVariable Long id){
        courseService.addCourse(course);
        return "redirect:/courses/"+id;
    }


}
