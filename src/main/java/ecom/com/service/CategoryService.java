package ecom.com.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import ecom.com.model.Category;

public interface CategoryService {

    public Category saveCategory(Category category);

    public Boolean existCategory(String name);

    public List<Category> getAllCategory();
    
    public Boolean deleteCategory(int id);
    
    public Category getCategoryById(int id);
    
    public List<Category> getAllActiveCategory();
    
    // Correct the return type and use Pageable
   // public Page<Category> getAllCategoryPagination(Pageable pageable);

	Page<Category> getAllCategorPagination(Integer pageNo, Integer pageSize);
}
