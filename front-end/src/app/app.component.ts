import { Component } from '@angular/core';
import { FormControl, FormGroup} from '@angular/forms';
import { Todo } from './todo';
import { TodoService } from './todo.service';



@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {

  todos: Todo[] = []

  form: FormGroup = new FormGroup({
    Nome : new FormControl('1 2 3 TESTANDO!')
  
  })

    constructor(

      private service : TodoService

)

  submit(){
    const todo: Todo = { ...this.form.value};
    this.service
    .salvar(todo)
    .subscribe(savedTodo => {
      this.todos.push(savedTodo)
      this.form.reset()
    }
      )
  }


}
