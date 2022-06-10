package com.example.stcs_webv;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;

public class HelloController {
    @FXML
    private WebView webView;

    @FXML
    private void initialize()
    {
        WebEngine engine = webView.getEngine();
        engine.load("http://localhost:8000");
    }
}