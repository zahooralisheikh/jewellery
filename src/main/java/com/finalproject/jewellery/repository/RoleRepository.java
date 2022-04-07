package com.finalproject.jewellery.repository;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;

import com.finalproject.jewellery.model.Role;
import com.finalproject.jewellery.model.User;

public interface RoleRepository extends JpaRepository<Role, Integer>{

 


}
