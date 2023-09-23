package ru.education.project.dao;

import ru.education.project.config.DBConnection;
import ru.education.project.constants.DBQueries;
import ru.education.project.entity.Book;
import ru.education.project.entity.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BookDAO {

    private final Connection connection;

    public BookDAO() throws SQLException {
        this.connection = DBConnection.getConnection();
    }

    public List<Book> getBooks() throws SQLException {
        PreparedStatement statement = connection.prepareStatement(DBQueries.SELECT_BOOKS);
        ResultSet resultSet = statement.executeQuery();

        List<Book> books = new ArrayList<>();
        while (resultSet.next()) {
            int id = resultSet.getInt("id");
            String title = resultSet.getString("title");
            String author = resultSet.getString("author");
            int yearOfCreate = resultSet.getInt("year_of_create");
            Book book = new Book(id, title, author, yearOfCreate);
            books.add(book);
        }

        return books;
    }

}
