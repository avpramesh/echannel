import { HttpClient } from "@angular/common/http";
import { Injectable } from "@angular/core";
import { Observable } from "rxjs/internal/Observable";
import { Eventsource } from "../models/eventsource.model";

const baseUrl = 'http://localhost:8080/api/echennals';

@Injectable({
  providedIn: 'root'
})

export class EventSource {
    constructor(private http: HttpClient) { }

  getAll(): Observable<Eventsource[]> {
    return this.http.get<Eventsource[]>(baseUrl);
  }

  get(id: any): Observable<Eventsource> {
    return this.http.get<Eventsource>(`${baseUrl}/${id}`);
  }

  create(data: any): Observable<any> {
    return this.http.post(baseUrl, data);
  }

  update(id: any, data: any): Observable<any> {
    return this.http.put(`${baseUrl}/${id}`, data);
  }

  delete(id: any): Observable<any> {
    return this.http.delete(`${baseUrl}/${id}`);
  }

  deleteAll(): Observable<any> {
    return this.http.delete(baseUrl);
  }

  findByStatus(status: any): Observable<Eventsource[]> {
    return this.http.get<Eventsource[]>(`${baseUrl}?statjs=${status}`);
  }
}
