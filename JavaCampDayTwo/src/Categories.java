
public class Categories {
	int categoryID;
	String categoryName;
	String categoryContent;
	
	public Categories() {
		
		System.out.println("<---Kategori Class� �a��r�ld�!--->");
	}
	
	public Categories(int categoryID, String categoryName, String categoryContent) {
		this();
		this.categoryID = categoryID;
		this.categoryName = categoryName;
		this.categoryContent = categoryContent;
		
	}
}
