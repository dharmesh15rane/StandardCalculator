import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http'
@Injectable({
  providedIn: 'root'
})
export class CalculatorServiceService {

  constructor(private http: HttpClient) { }

  getData(first: number | undefined, oprator: any, second: number) {
    return this.http.get(`http://localhost:8082/api/${first}/${oprator}/${second}`);
  }
  getopration(action: any, first: number | undefined) {
    console.log(first)
    return this.http.get(`http://localhost:8082/api/${action}/${first}`);
  }
}