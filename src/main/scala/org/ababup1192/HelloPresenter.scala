package org.ababup1192

import java.net.URL
import java.util.ResourceBundle
import javafx.scene.{control => jfxsc}
import javafx.{event => jfxe, fxml => jfxf}

class HelloPresenter extends jfxf.Initializable {

  @jfxf.FXML
  private[this] var label: jfxsc.Label = _
  @jfxf.FXML
  private[this] var textField: jfxsc.TextField = _

  @jfxf.FXML
  def handle(event: jfxe.ActionEvent): Unit = {
    label.setText(textField.getText)
  }

  override def initialize(location: URL, resources: ResourceBundle): Unit = {

  }
}
