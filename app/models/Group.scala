package models

class Group(val name: String, val projects: List[Group], val subgroups: List[Group]) {

}


