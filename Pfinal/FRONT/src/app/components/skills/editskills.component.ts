import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Skills } from 'src/app/model/skills';
import { SkillsService } from 'src/app/service/skills.service';

@Component({
  selector: 'app-editskills',
  templateUrl: './editskills.component.html',
  styleUrls: ['./editskills.component.css']
})
export class EditskillsComponent implements OnInit {
  skills: Skills = null;

  constructor(
    private skillsS: SkillsService,
    private activatedRouter: ActivatedRoute,
    private router: Router
  ) { }

  ngOnInit(): void {
    const id = this.activatedRouter.snapshot.params['id'];
    this.skillsS.detail(id).subscribe(
      data => {
        this.skills = data;
      }, err => {
        alert ("error al modificar SKILLS");
        this.router.navigate(['']);
      }
    )
  }
  onUpdate(): void {
    const id = this.activatedRouter.snapshot.params['id'];
    this.skillsS.update(id, this.skills).subscribe(
      data => {
        this.router.navigate(['']);
      }, err => {
        alert(" ERROR AL MODIFICAR LA SKILL-HABILIDAD");
        this.router.navigate(['']);
      }
    )
  }


}
