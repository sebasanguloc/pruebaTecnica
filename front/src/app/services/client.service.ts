import {inject, Injectable} from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {ClientRequestDto} from '../interfaces/client';
import {map, Observable} from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class ClientService {

  http = inject(HttpClient);
  pathBase = 'http://localhost:8080';

  constructor() { }

  findClients(): Observable<ClientRequestDto[]> {
    console.log('ejecutando');
    return this.http.get<ClientRequestDto[]>('/clients');
  }

}
