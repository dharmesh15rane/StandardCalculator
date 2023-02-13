import { Component } from '@angular/core';
import { CalculatorServiceService } from './calculator-service.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'calci-app';
  display = '';
  firstValue: number | undefined;
  action: any;
  opration: any;
  constructor(private service: CalculatorServiceService) { }
  getValue() {
    const a = this.firstValue;
    const b = parseFloat(this.display);
    this.service.getData(a, this.action, b).subscribe(response => {
      this.firstValue = 0;
      this.display = response.toString();
    });

  }
  singleOp(action: any) {
    this.firstValue = parseFloat(this.display);
    this.action = action;
    this.display = ' ';
    this.service.getopration(this.action, this.firstValue).subscribe(response => {
      console.log(this.display = response.toString());
    })
  }
  numClick(val: any) {
    if (this.display === '0') {
      this.display = val.toString();
    } else {
      this.display = `${this.display}${val}`;
    }
  }
  oper(action: any) {
    this.firstValue = parseFloat(this.display);
    this.action = action;
    this.display = ' ';
  }
  reset() {
    this.action = '';
    this.display = '';
    this.firstValue = 0;
  }

}
