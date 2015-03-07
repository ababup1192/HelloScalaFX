package org.ababup1192

import java.io.IOException
import javafx.{fxml => jfxf, scene => jfxs}

import scalafx.Includes._
import scalafx.application.JFXApp
import scalafx.application.JFXApp.PrimaryStage
import scalafx.scene.Scene

object Main extends JFXApp {

  val resource = getClass.getResource("/sample.fxml")
  if (resource == null) {
    throw new IOException("Cannot load resource: sample.fxml")
  }

  val root: jfxs.Parent = jfxf.FXMLLoader.load(resource)

  stage = new PrimaryStage() {
    title = "Hello ScalaFX"
    scene = new Scene(root)
  }

}
