import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Skills } from 'src/app/model/skills';
import { SkillsService } from 'src/app/service/skills.service';

@Component({
  selector: 'app-newskills',
  templateUrl: './newskills.component.html',
  styleUrls: ['./newskills.component.css']
})
export class NewskillsComponent implements OnInit {
  nombreS: string;
  porcentajeS: string;

  constructor(private skillsS: SkillsService, private router: Router) { }

  ngOnInit(): void {
  }

  onCreate(): void {
    const skills = new Skills(this.nombreS, this.porcentajeS);
    this.skillsS.save(skills).subscribe(
      data => {
        alert ("Skill añadida OK");
        this.router.navigate(['']);
      }, err => {
        alert("error al crear skills");
        this.router.navigate(['']);
      }
    )
  }
}
