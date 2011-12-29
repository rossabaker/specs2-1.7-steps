import org.specs2._
import specification._
import Thread.sleep

object Trace {
  def trace[T](what: String)(action: =>T) = {
    println(">>> "+what)
    val result = action
    println("<<< "+what)
    result
  }
}
import Trace.trace

class ServerSpec extends BaseSpec { def is =
  "This is a specification of the order of steps"                             ^
                                                                              p^
  "The server must be running in"                                             ^
    "the first test"                                                          ! test(1000, "e1")^
    "the second test"                                                         ! test(2000, "e2")^
    "the third test"                                                          ! test(3000, "e3")^
                                                                              end

  def test(sleepTime: Int, name: String) = trace(name) { 
    sleep(sleepTime); 
    serverRunning must beTrue 
  }
}

trait BaseSpec extends Specification {
   var serverRunning = false;

   override def map(fs: =>Fragments) = Step(start()) ^ super.map(fs) ^ Step(stop())   

   def start() = trace("start") { 
     serverRunning = true 
     Thread.sleep(1000); 
   }

   def stop() = trace("stop") { 
     serverRunning = false
   }
 }
