const application = Stimulus.Application.start()

class IndexController extends Stimulus.Controller {
    static get targets() {
        return ["name", "source"]
    }

    connect() {
        //console.log("Hello from stimulus!", this.element)
    }

    act() {
        var data = this.sourceTarget.value;
        console.log(`Value is: ${data}`);
        this.nameTarget.innerHTML=data;
    }

}

application.register("index", IndexController);