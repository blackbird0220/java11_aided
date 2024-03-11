package creational.abstactfactory;

import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;

public abstract class Page {
	protected String title;
	protected String author;
	protected ArrayList content = new ArrayList();

	public Page(String title, String author) {
		super();
		this.title = title;
		this.author = author;
	}
	public void add(Item item) {
		content.add(item);
	}
	public void output() {
		String filename = title +".html";
		Writer writer = new FileWriter(filename);
		writer.writer(this.makeHTML());
		writer.close();
		System.out.println(filename + "을 작성하였습니다.");
	} catch (IOException e) {
		e.printStackTrace();
	}
}
