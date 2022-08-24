import { Component, OnInit } from '@angular/core';
import { Storage, ref, uploadBytes, listAll, getDownloadURL } from '@angular/fire/storage';

@Component({
  selector: 'app-banner',
  templateUrl: './banner.component.html',
  styleUrls: ['./banner.component.css']
})
export class BannerComponent implements OnInit {
  /*title = 'storage';*/
  images: string[]= [];

  constructor(private storage: Storage) { }

  ngOnInit(): void {
    this.getImages();
  }

  subirArchivo($event: any) {
    const file = $event.target.files[0];

    const imgRef = ref(this.storage, `images/${file.name}`);

    uploadBytes(imgRef, file).then(x => {
      /*console.log(x);*/
      this.getImages
    }).catch(error => console.log(error));
  }

    getImages() {
      const imagesRef = ref(this.storage, 'images');

      listAll(imagesRef).then(async images => {
        this.images = [];
        for(let image of images.items) {
          const url = await getDownloadURL(image);
          this.images.push(url);
        }
      }).catch(error => console.log(error));
      
    }
}
