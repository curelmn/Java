package Test_0126.operation;

import Test_0126.BookList;

public class DelOperation implements IOperation{
    @Override
    public void work(BookList bookList) {
        System.out.println("删除书籍");
    }
}
