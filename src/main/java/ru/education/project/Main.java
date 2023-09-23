package ru.education.project;

import ru.education.project.config.DBConnection;
import ru.education.project.dao.BookDAO;
import ru.education.project.entity.Book;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws SQLException {
        BookDAO bookDAO = new BookDAO();
        List<Book> books = bookDAO.getBooks();

        System.out.println(books);
    }

}
