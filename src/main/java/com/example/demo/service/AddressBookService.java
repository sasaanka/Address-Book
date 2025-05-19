package com.example.demo.service;
import com.example.demo.dto.AddressBookDTO;
import com.example.demo.model.AddressBook;
import com.example.demo.repository.AddressBookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressBookService implements IAddressBookService {

    @Autowired
    private AddressBookRepository repository;

    @Override
    public AddressBook addAddress(AddressBookDTO dto) {
        AddressBook ab = new AddressBook();
        ab.setName(dto.getName());
        ab.setAddress(dto.getAddress());
        return repository.save(ab);
    }

    @Override
    public List<AddressBook> getAll() {
        return repository.findAll();
    }

    @Override
    public AddressBook getById(int id) {
        return repository.findById(id).orElseThrow();
    }

    @Override
    public AddressBook update(int id, AddressBookDTO dto) {
        AddressBook ab = getById(id);
        ab.setName(dto.getName());
        ab.setAddress(dto.getAddress());
        return repository.save(ab);
    }

    @Override
    public void delete(int id) {
        repository.deleteById(id);
    }
}
