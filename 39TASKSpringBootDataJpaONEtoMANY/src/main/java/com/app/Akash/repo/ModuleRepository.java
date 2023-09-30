package com.app.Akash.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.app.Akash.entity.*;
import com.app.Akash.entity.Module;
public interface ModuleRepository extends JpaRepository<Module, Integer> {

}
