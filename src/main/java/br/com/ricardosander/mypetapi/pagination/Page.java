package br.com.ricardosander.mypetapi.pagination;

import java.util.List;

public class Page<T> {

  private final List<T> content;

  private final Integer totalPages;

  private final Long totalElements;

  private final Integer numberOfElements;

  private final Integer size;

  private final Integer page;

  public static Page from(org.springframework.data.domain.Page page) {
    return new Page(page);
  }

  private Page(org.springframework.data.domain.Page page) {
    this.content = page.getContent();
    this.totalPages = page.getTotalPages();
    this.totalElements = page.getTotalElements();
    this.numberOfElements = page.getNumberOfElements();
    this.size = page.getSize();
    this.page = page.getNumber() + 1;
  }

  public List<T> getContent() {
    return content;
  }

  public Integer getTotalPages() {
    return totalPages;
  }

  public Long getTotalElements() {
    return totalElements;
  }

  public Integer getNumberOfElements() {
    return numberOfElements;
  }

  public Integer getSize() {
    return size;
  }

  public Integer getPage() {
    return page;
  }

}
