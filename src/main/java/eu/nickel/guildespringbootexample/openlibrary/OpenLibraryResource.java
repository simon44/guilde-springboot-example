package eu.nickel.guildespringbootexample.openlibrary;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.NotEmpty;

@RestController
@RequestMapping("/openlibrary")
public class OpenLibraryResource {

    private final OpenLibraryService openLibraryService;

    public OpenLibraryResource(OpenLibraryService openLibraryService) {
        this.openLibraryService = openLibraryService;
    }

    @GetMapping
    SearchResult query(@RequestParam("query") @NotEmpty String query) {
        return openLibraryService.getSearchResult(query);
    }
}
