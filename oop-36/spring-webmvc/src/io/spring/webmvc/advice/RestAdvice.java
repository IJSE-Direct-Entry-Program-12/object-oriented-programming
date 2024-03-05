package io.spring.webmvc.advice;

import io.spring.webmvc.api.*;
import io.spring.webmvc.util.*;

public class RestAdvice {
    HttpController controller = new HttpController();
    RestController restController = new RestController();
    PreAuthorize preAuthorize = new PreAuthorize();
    PostAuthorize postAuthorize = new PostAuthorize();
}
