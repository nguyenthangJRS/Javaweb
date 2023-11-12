package nguyenthangJavaWeb.Paging;

import nguyenthangJavaWeb.Sort.Sorter;

public interface Pageble {
	Integer getPage();
	Integer getOffset();
	Integer getLimit();
	Sorter getSorter();
}
