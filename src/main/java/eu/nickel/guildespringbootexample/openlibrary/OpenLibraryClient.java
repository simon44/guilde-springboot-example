package eu.nickel.guildespringbootexample.openlibrary;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(
        name="OpenLibraryClient",
        url = "${application.api.open-library.base-url}"
)
public interface OpenLibraryClient {

    @GetMapping("/search.json")
    SearchResult query(@RequestParam("q") String query);
}
