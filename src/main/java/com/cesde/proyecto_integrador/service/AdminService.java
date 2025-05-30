package com.cesde.proyecto_integrador.service;

import com.cesde.proyecto_integrador.model.Admin;
import com.cesde.proyecto_integrador.repository.AdminRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AdminService {

    private final AdminRepository adminRepository;

    public AdminService(AdminRepository adminRepository) {
        this.adminRepository = adminRepository;
    }

    public List<Admin> getAll() {
        return adminRepository.findAll();
    }

    public Optional<Admin> getById(Long id) {
        return adminRepository.findById(id);
    }

    public Admin create(Admin admin) {
        return adminRepository.save(admin);
    }

    public Optional<Admin> update(Long id, Admin admin) {
        if (adminRepository.existsById(id)) {
            admin.setId(id);
            return Optional.of(adminRepository.save(admin));
        }
        return Optional.empty();
    }

    public void delete(Long id) {
        adminRepository.deleteById(id);
    }
}