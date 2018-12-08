import scala.scalajs.js.annotation.JSExportTopLevel
import org.scalajs.dom.document
import com.thoughtworks.binding.dom

import com.sadhen.binding.component.tag._
import com.sadhen.binding.component.autoVar

@JSExportTopLevel("ProgressSpec")
object ProgressSpec extends MainEntry {

  @dom
  override def body = {
    <div>
      <hr></hr>
      <Progress value={5} total={100}></Progress>
      <hr></hr>
    </div>
  }
}