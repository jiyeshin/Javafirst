package arrays;

public class Book implements Comparable {
	// 저장하고자 하는 항목
	private String title;
	private String author;
	private String pubdate;
	private int price;

	// 접근자 메소드
	public String getTitle() {
		return title;

	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPubdate() {
		return pubdate;
	}

	public void setPubdate(String pubdate) {
		this.pubdate = pubdate;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", pubdate=" + pubdate + ", price=" + price + "]";
	}

	// 크기 비교하는 메소드
	@Override
	// this는 나, object o는 비교할 대상
	public int compareTo(Object o) {
		Book other = (Book) o;
		
		//가격으로 비교
		/*
		 * return this.price-other.price; 오름차순
		 * return (this.price-other.price)*-1; 내림차순
		 */
		
		/*if (this.price > other.price) {
			return 1; //양수면 오름차순
		} else if (this.price == other.price) {
			return 0;
		} else {
			return -1;
		}*/
		
		//제목으로 비교 - ㄱㄴㄷ순
		return this.title.compareTo(other.title);
		
		
	}

}
