
export interface NoteDto {
  id: number;
  title: string;
  createdAt: string; // LocalDate en backend → string en Angular
}

export interface ClientRequestDto {
  name: string;
}
