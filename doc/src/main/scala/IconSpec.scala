import scala.scalajs.js.annotation.JSExportTopLevel
import com.sadhen.binding.magic.ant
import com.sadhen.binding.component.tag._
import com.sadhen.binding.component.autoVar
import com.thoughtworks.binding.Binding.Var
import org.scalajs.dom.raw.Event

@JSExportTopLevel("IconSpec")
object IconSpec extends MainEntry {
  val disabled: Var[Boolean] = Var(true)

  @ant
  override def body = {
    <div>
      <hr></hr>
      <div>
        <Icon type="users" disabled={ disabled } onclick={ event: Event => disabled.value = !disabled.value }/>
      </div>
      <hr></hr>
      <div>
        <Icon type="spinner" loading={true}></Icon>
        <Icon type="notched" loading={true}></Icon>
        <Icon type="asterick" loading={true}></Icon>
      </div>
      <hr></hr>
      <Icon type="users" color="red" />
      <Icon type="users" color="orange" />
      <Icon type="users" color="yellow" />
      <Icon type="users" color="olive" />
      <Icon type="users" color="green" />
      <Icon type="users" color="teal" />
      <Icon type="users" color="blue" />
      <Icon type="users" color="violet" />
      <Icon type="users" color="purple" />
      <Icon type="users" color="pink" />
      <Icon type="users" color="brown" />
      <Icon type="users" color="grey" />
      <Icon type="users" color="black" />
      <hr></hr>
    </div>
  }
}
