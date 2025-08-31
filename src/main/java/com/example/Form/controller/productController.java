package com.example.Form.controller;

import com.example.Form.model.productModel;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class productController {
    private List<productModel> products = new ArrayList<>(List.of(
            new productModel(1,"Sandeep",2443),
            new productModel(2,"Happy",533),
            new productModel(3,"Ramjee",232)
    ));


    @RequestMapping("/")
    public String home(Model pr){
        pr.addAttribute("products",products);
        return "menu";
    }

    @GetMapping("/add")
    public String productList(Model model){
        model.addAttribute("product",new productModel());
        return "productHtml";
    }

    @PostMapping("/addNewProduct")
    public String addProduct(@Valid @ModelAttribute("product") productModel product, BindingResult result,Model model){
        if(result.hasErrors()){
            System.out.println(result);
//            model.addAttribute("product",product);
            return "productHtml";
        }

        products.add(product);
        return "redirect:/";
    }
}
