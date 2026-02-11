import {Component, inject, linkedSignal} from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {ClientService} from '../../services/client.service';
import {rxResource} from '@angular/core/rxjs-interop';
import {ClientRequestDto} from '../../interfaces/client';

@Component({
  selector: 'app-dashboard-page',
  imports: [],
  templateUrl: './dashboard-page.component.html',
  styleUrl: './dashboard-page.component.css'
})
export class DashboardPageComponent {

  clientService = inject(ClientService);
  clients = linkedSignal(() => this.clientResource.value() ?? []);

  clientResource = rxResource({
    request: () => ({}),
    loader: () => this.clientService.findClients()
  });

  consultar(){
    console.log('consultando');
  }

}
