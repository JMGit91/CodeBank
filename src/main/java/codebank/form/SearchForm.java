package codebank.form;


import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;


public class SearchForm {

    @NotBlank(message = "Please enter search term.")
    private String search;


    @NotNull(message = "Please pick a search parameter.")
    private RadioStatus status;

    public SearchForm() {};

    public SearchForm(String search,
                      RadioStatus status) {
        this.search = search;
        this.status = status;
    }

    public String getSearch() {
        return search;
    }

    public void setSearch(String search) {
        this.search = search;
    }

    public RadioStatus getStatus() {
        return status;
    }

    public void setStatus(RadioStatus status) {
        this.status = status;
    }
}
