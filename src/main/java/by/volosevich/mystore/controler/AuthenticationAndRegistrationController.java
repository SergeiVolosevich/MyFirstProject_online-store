package by.volosevich.mystore.controler;


import by.volosevich.mystore.model.Users;
import by.volosevich.mystore.service.UserService;
import org.hibernate.validator.messageinterpolation.ResourceBundleMessageInterpolator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;
import java.util.Locale;

@Controller

public class AuthenticationAndRegistrationController {

    private static final Logger logger = LoggerFactory.getLogger(ProductController.class);

    @Autowired
    private MessageSource messageSource;

    @Autowired
    private UserService userService;

    @ModelAttribute
    public Users createUser() {
        return new Users();
    }

    @GetMapping(value = "/admin")
    public String getAdminPage() {
        return "admin";
    }

    @GetMapping(value = "/user")
    public String getUserPage() {
        return "user";
    }


    @GetMapping(value = "/LogedIn")
    public String authenticatedUser() {
        return "LogedIn";
    }

    @GetMapping(value = "/registration")
    public ModelAndView getRegistrationPage() {
        ModelAndView model = new ModelAndView("registration");
        model.addObject("user", new Users());
        return model;
    }


    @PostMapping(value = "/registration")
    public ModelAndView loginProcess(@Valid @ModelAttribute("user") Users user, BindingResult bindingResult, ModelMap model,
                                     RedirectAttributes redirectAttributes, Locale locale,
                                     HttpServletRequest request, HttpServletResponse response) throws Exception {

        ModelAndView modelAndView = new ModelAndView();
        if (!bindingResult.hasErrors()) {
            userService.registerUser(user);
            RedirectView redirectView = new RedirectView("registrationOk");
            modelAndView.setView(redirectView);
            redirectAttributes.addFlashAttribute("success", messageSource.getMessage("registration_success",
                    null, locale));
        } else {
            modelAndView.setViewName("registration");
        }
        return modelAndView;
    }

    @GetMapping(value = "/registrationOk")
    public String registrationSuccess() {
        return "registrationOk";
    }

    @GetMapping(value = "/login")
    public ModelAndView login(@RequestParam(value = "error", required = false) String error,
                              @RequestParam(value = "logout", required = false) String logout) {
        ModelAndView modelAndView = new ModelAndView("login");
        modelAndView.addObject("error", error != null);
        modelAndView.addObject("logout", logout != null);
        return modelAndView;
    }

    @GetMapping(value = "/invalidAccess")
    public ModelAndView invalidAccess(Exception exp, Locale locale) {
        logger.error("Access is Denied" + exp.getMessage());
        ModelAndView modelAndView = new ModelAndView("accessDenied");
        modelAndView.addObject("errorMessage", messageSource.getMessage("access_denied", null, locale));
        return modelAndView;
    }

}
