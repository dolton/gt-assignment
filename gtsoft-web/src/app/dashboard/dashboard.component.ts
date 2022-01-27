import { Component, OnInit } from '@angular/core';
import { DashboardService } from './dashboard.service';
import { FormBuilder } from '@angular/forms';

@Component({
  selector: 'app-dashboard',
  templateUrl: './dashboard.component.html',
  styleUrls: ['./dashboard.component.css']
})
export class DashboardComponent implements OnInit {

  responseData: any = {};
  filteredData: any = [];
  displayDataList: any = [];
  searchBy: String = 'none';
  searchText: String = '';

  numPerPage: Number = 5;
  currentPage: Number = 1;
  noOfPages: Number = 0;
  displayStartNumber: Number = 0;
  displayEndNumber: Number = 0;

  constructor(
    private _fb: FormBuilder,
    private _dashboardService: DashboardService
  ) { }

  ngOnInit(): void {
    this.getCustomerList();
  }

  getCustomerList() {

    // this._spinnerService.show();
    this._dashboardService.getCustomerList().subscribe(res => {

      // this._spinnerService.hide();
      if (res.status == 'success') {
        this.responseData = res.response;
        this.filteredData = this.responseData.data;

        this.setPagination();
      }
      else {
        // Toast.fire('Failed', res.error, "error");
      }
    });
  }

  applyFilter() {

    if (this.searchBy != 'none') {

      if (this.searchText != '') {

        this.filteredData = [];
        let dataList = this.responseData.data;

        dataList.forEach(data => {

          let selData = data[this.searchBy.toString()].toLowerCase();

          if (selData && selData.indexOf(this.searchText.toLowerCase()) != -1) {
            this.filteredData.push(data);
          }
        });

        this.currentPage = 1;
        this.setPagination();
      }
      else {
        this.filteredData = this.responseData.data;
        this.setPagination();
      }
    }
    else {
      this.searchText = '';
      this.filteredData = this.responseData.data;
      this.setPagination();
    }
  }

  private setPagination = function () {

    this.noOfPages = Math.ceil(this.filteredData.length / this.numPerPage);
    if (this.noOfPages == 0) {
      this.noOfPages = 1
    }

    let begin = ((this.currentPage - 1) * this.numPerPage);
    let end = begin + this.numPerPage;
    this.displayDataList = this.filteredData.slice(begin, end);

    this.displayStartNumber = begin + 1;

    if (end > this.filteredData.length) {
      end = this.filteredData.length;
    }

    this.displayEndNumber = end;
  }

  nextPage = function () {

    if (this.currentPage < this.noOfPages) {
      this.currentPage++;
      this.setPagination();
    }
  }

  previousPage = function () {

    if (this.currentPage > 1) {
      this.currentPage--;
      this.setPagination();
    }
  }
}
