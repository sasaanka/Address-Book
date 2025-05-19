package com.example.demo.service;


import com.example.demo.dto.AddressBookDTO;
import com.example.demo.model.AddressBook;

import java.util.List;

public interface IAddressBookService {
    AddressBook addAddress(AddressBookDTO dto);
    List<AddressBook> getAll();
    AddressBook getById(int id);
    AddressBook update(int id, AddressBookDTO dto);
    void delete(int id);
}
