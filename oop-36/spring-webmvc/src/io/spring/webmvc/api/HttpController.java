package io.spring.webmvc.api;

import io.spring.webmvc.util.*;
import io.spring.web.context.*;

public class HttpController {
    PreAuthorize preAuthorize = new PreAuthorize();
    PostAuthorize postAuthorize = new PostAuthorize();
    WebApplicationContext context = new WebApplicationContext();
}
