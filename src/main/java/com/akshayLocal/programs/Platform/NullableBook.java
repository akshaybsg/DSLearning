package com.akshayLocal.programs.Platform;

import java.util.Optional;

public class NullableBook {
    Optional<String> bookname;

    public Optional<String> getBookname() {
        return bookname;
    }

    public NullableBook(Optional<String> bookname) {
        this.bookname = bookname;
    }
}
