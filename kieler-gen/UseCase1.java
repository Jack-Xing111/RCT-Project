/*
 * Automatically generated Java code by
 * KIELER SCCharts - The Key to Efficient Modeling
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 */

public class UseCase1 {

  public double deltaT;
  public double sleepT;
  public boolean _region0_c1_start;
  public boolean _region0_c1_stop;
  public boolean _region1_c2_start;
  public boolean _region1_c2_stop;
  public double _UseCase1_local_x;
  public boolean _UseCase1_local_ActionDone;
  public boolean _UseCase1_local_Remind_Nurse;
  public boolean _UseCase1_local__Atrig;
  public boolean _UseCase1_local__Atrig1;
  public double _UseCase1_local_x1;
  public boolean _UseCase1_local_ActionDone1;
  public boolean _UseCase1_local_Remind_Nurse1;
  public boolean _UseCase1_local__Atrig2;
  public boolean _UseCase1_local__Atrig3;
  public boolean _g2;
  public boolean _g5;
  public boolean _g7;
  public boolean _g8;
  public boolean _g9;
  public boolean _g11;
  public boolean _g12;
  public boolean _g14;
  public boolean _g17;
  public boolean _g18;
  public boolean _g19;
  public boolean _g20;
  public boolean _g21;
  public boolean _g22;
  public boolean _g23;
  public boolean _g25;
  public boolean _g26;
  public boolean _g27;
  public boolean _g29;
  public boolean _g30;
  public boolean _g31;
  public boolean _g32;
  public boolean _g33;
  public boolean _g34;
  public boolean _g35;
  public boolean _g36;
  public boolean _g39;
  public boolean _g40;
  public boolean _g41;
  public boolean _g42;
  public boolean _g43;
  public boolean _g44;
  public boolean _g47;
  public boolean _g48;
  public boolean _g49;
  public boolean _g50;
  public boolean _g53;
  public boolean _g54;
  public boolean _g55;
  public boolean _g57;
  public boolean _g60;
  public boolean _g63;
  public boolean _g65;
  public boolean _g66;
  public boolean _g67;
  public boolean _g69;
  public boolean _g70;
  public boolean _g75;
  public boolean _g76;
  public boolean _g77;
  public boolean _g78;
  public boolean _g79;
  public boolean _g80;
  public boolean _g81;
  public boolean _g84;
  public boolean _g85;
  public boolean _g87;
  public boolean _g88;
  public boolean _g89;
  public boolean _g90;
  public boolean _g92;
  public boolean _g93;
  public boolean _g98;
  public boolean _g99;
  public boolean _g100;
  public boolean _g101;
  public boolean _g102;
  public boolean _g105;
  public boolean _g106;
  public boolean _g107;
  public boolean _GO;
  public boolean _cg57;
  public boolean _cg26;
  public boolean _cg11;
  public boolean _cg14;
  public boolean _cg7;
  public boolean _cg8;
  public boolean _cg12;
  public boolean _cg19;
  public boolean _cg17;
  public boolean _cg21;
  public boolean _cg25;
  public boolean _cg43;
  public boolean _cg33;
  public boolean _cg36;
  public boolean _cg29;
  public boolean _cg30;
  public boolean _cg34;
  public boolean _cg41;
  public boolean _cg39;
  public boolean _cg47;
  public boolean _cg53;
  public boolean _cg115;
  public boolean _cg84;
  public boolean _cg69;
  public boolean _cg72;
  public boolean _cg65;
  public boolean _cg66;
  public boolean _cg70;
  public boolean _cg77;
  public boolean _cg75;
  public boolean _cg79;
  public boolean _cg83;
  public boolean _cg101;
  public boolean _cg91;
  public boolean _cg94;
  public boolean _cg87;
  public boolean _cg88;
  public boolean _cg92;
  public boolean _cg99;
  public boolean _cg97;
  public boolean _cg105;
  public boolean _cg111;
  public boolean _g9_e1;
  public boolean _g18_e2;
  public boolean _g31_e1;
  public boolean _g40_e2;
  public boolean _g22_e1;
  public boolean _g48_e2;
  public boolean _g50_e1;
  public boolean _g54_e2;
  public boolean _g67_e1;
  public boolean _g76_e2;
  public boolean _g89_e1;
  public boolean _g98_e2;
  public boolean _g80_e1;
  public boolean _g106_e2;
  public boolean _TERM;
  public boolean _pg39;
  public boolean _pg43;
  public boolean _pg44;
  public boolean _pg30;
  public boolean _pg32;
  public boolean _pg35;
  public boolean _pg8;
  public boolean _pg12;
  public boolean _pg19;
  public boolean _pg18_e2;
  public boolean _pg69;
  public boolean _pg101;
  public boolean _pg102;
  public boolean _pg92;
  public boolean _pg90;
  public boolean _pg93;
  public boolean _pg66;
  public boolean _pg70;
  public boolean _pg77;
  public boolean _pg67;

  public void reset() {
    _GO = true;
    _TERM = false;
    deltaT = 0.0;
    sleepT = 0.0;
    _pg39 = false;
    _pg43 = false;
    _pg44 = false;
    _pg30 = false;
    _pg32 = false;
    _pg35 = false;
    _pg8 = false;
    _pg12 = false;
    _pg19 = false;
    _pg18_e2 = false;
    _pg69 = false;
    _pg101 = false;
    _pg102 = false;
    _pg92 = false;
    _pg90 = false;
    _pg93 = false;
    _pg66 = false;
    _pg70 = false;
    _pg77 = false;
    _pg67 = false;
  }

  public void logic() {
    _g57 = _pg39;
    _g2 = _GO || _g57 && _region0_c1_start;
    if (_g2) {
      _UseCase1_local_x = 0;
    }
    _g25 = _pg43;
    _cg25 = _region0_c1_stop || _region0_c1_stop;
    _g47 = _pg44;
    _g49 = _g47 && !_region0_c1_stop;
    if (_g49) {
      _UseCase1_local_x += deltaT;
    }
    _g39 = _pg30;
    _cg39 = _region0_c1_stop || _region0_c1_stop;
    _g41 = _g39 && !_cg39;
    _cg41 = _UseCase1_local_x >= 5;
    _g42 = _g41 && _cg41;
    if (_g42) {
      _UseCase1_local__Atrig1 = true;
    }
    _g27 = _g25 && !_cg25;
    if (_g27) {
      _UseCase1_local_x = 0;
      _UseCase1_local__Atrig1 = false;
    }
    _g33 = _pg32;
    _cg33 = _region0_c1_stop || _region0_c1_stop;
    _g36 = _pg35;
    _cg36 = _region0_c1_stop || _region0_c1_stop;
    _g29 = _g27 || _g33 && !_cg33 || _g36 && !_cg36;
    _cg29 = _UseCase1_local_x < 5.0;
    _g34 = _g29 && !_cg29;
    _cg34 = _UseCase1_local__Atrig1;
    _g35 = _g34 && !_cg34;
    sleepT = 1000.0;
    _g29 = _g29 && _cg29;
    if (_g29) {
      sleepT = (sleepT < (5.0 - _UseCase1_local_x)) ? sleepT : (5.0 - _UseCase1_local_x);
    }
    _cg30 = _UseCase1_local__Atrig1;
    _g32 = _g29 && !_cg30;
    _g31_e1 = !(_g35 || _g32);
    _g34 = _g29 && _cg30 || _g33 && _cg33 || _g34 && _cg34 || _g36 && _cg36;
    _g30 = _g27 || _g41 && !_cg41;
    _g27 = !_g30;
    _g41 = _g39 && _cg39 || _g42;
    _g42 = (_g31_e1 || _g34) && (_g27 || _g41) && (_g34 || _g41);
    _cg43 = _region0_c1_stop || _region0_c1_stop;
    _g40 = _g25 && _cg25 || _g42 && _cg43;
    _g31 = _g2 || _g40 && !_region0_c1_stop;
    if (_g31) {
      _UseCase1_local__Atrig = false;
    }
    _g31_e1 = _pg8;
    _g40_e2 = _pg12;
    _g7 = _g31 || _g31_e1 && !_region0_c1_stop || _g40_e2 && !_region0_c1_stop;
    _cg7 = _UseCase1_local_x < 1.0;
    _g8 = _g7 && _cg7;
    if (_g8) {
      sleepT = (sleepT < (1.0 - _UseCase1_local_x)) ? sleepT : (1.0 - _UseCase1_local_x);
    }
    _g17 = _pg19;
    _g19 = _g17 && !_region0_c1_stop;
    _cg19 = _UseCase1_local_x >= 1;
    _g20 = _g19 && _cg19;
    if (_g20) {
      _UseCase1_local__Atrig = true;
    }
    _cg8 = _UseCase1_local__Atrig;
    _g7 = _g7 && !_cg7;
    _cg12 = _UseCase1_local__Atrig;
    _g9 = _g8 && _cg8 || _g31_e1 && _region0_c1_stop || _g7 && _cg12 || _g40_e2 && _region0_c1_stop;
    _g8 = _g8 && !_cg8;
    _g12 = _g7 && !_cg12;
    _g19 = _g31 || _g19 && !_cg19;
    _g5 = _g17 && _region0_c1_stop || _g20;
    _g20 = !(_g12 || _g8);
    _g18_e2 = !_g19;
    _g9 = (_g20 || _g9) && (_g18_e2 || _g5) && (_g9 || _g5);
    _g9_e1 = _g9 && _region0_c1_stop || _g40 && _region0_c1_stop;
    _g18 = _pg18_e2;
    _g18_e2 = _g2 || _g18 && !_region0_c1_stop;
    if (_g18_e2) {
      _UseCase1_local_Remind_Nurse = false;
    }
    _g26 = _g9 && !_region0_c1_stop;
    if (_g26) {
      _UseCase1_local_Remind_Nurse |= true;
    }
    _g21 = _g42 && !_cg43;
    if (_g21) {
      _UseCase1_local_Remind_Nurse |= true;
    }
    _g43 = _g26 || _g21;
    _g44 = _g2 || _g49;
    _g23 = _g47 && _region0_c1_stop;
    _g49 = !(_g17 || _g40_e2 || _g31_e1 || _g25 || _g39 || _g36 || _g33);
    _g2 = !_g47;
    _g48 = (_g49 || _g9_e1) && (_g2 || _g23) && (_g9_e1 || _g23);
    _g22_e1 = _g18 && _region0_c1_stop;
    _g48_e2 = !(_g47 || _g17 || _g40_e2 || _g31_e1 || _g25 || _g39 || _g36 || _g33);
    _g22 = !_g18;
    _g17 = (_g48_e2 || _g48) && (_g22 || _g22_e1) && (_g48 || _g22_e1);
    _g39 = _g17 || _g57 && !_region0_c1_start;
    _g11 = _pg69;
    _g33 = _GO || _g11 && _region1_c2_start;
    if (_g33) {
      _UseCase1_local_x1 = 0;
    }
    _g25 = _pg101;
    _cg83 = _region1_c2_stop || _region1_c2_stop;
    _g14 = _pg102;
    _g47 = _g14 && !_region1_c2_stop;
    if (_g47) {
      _UseCase1_local_x1 += deltaT;
    }
    _g36 = _pg92;
    _cg97 = _region1_c2_stop || _region1_c2_stop;
    _g53 = _g36 && !_cg97;
    _cg99 = _UseCase1_local_x1 >= 5;
    _g54_e2 = _g53 && _cg99;
    if (_g54_e2) {
      _UseCase1_local__Atrig3 = true;
    }
    _g54 = _g25 && !_cg83;
    if (_g54) {
      _UseCase1_local_x1 = 0;
      _UseCase1_local__Atrig3 = false;
    }
    _g50_e1 = _pg90;
    _cg91 = _region1_c2_stop || _region1_c2_stop;
    _g50 = _pg93;
    _cg94 = _region1_c2_stop || _region1_c2_stop;
    _g55 = _g54 || _g50_e1 && !_cg91 || _g50 && !_cg94;
    _cg87 = _UseCase1_local_x1 < 5.0;
    _g57 = _g55 && !_cg87;
    _cg92 = _UseCase1_local__Atrig3;
    _g93 = _g57 && !_cg92;
    _g87 = _g55 && _cg87;
    if (_g87) {
      sleepT = (sleepT < (5.0 - _UseCase1_local_x1)) ? sleepT : (5.0 - _UseCase1_local_x1);
    }
    _cg88 = _UseCase1_local__Atrig3;
    _g90 = _g87 && !_cg88;
    _g89_e1 = !(_g93 || _g90);
    _g88 = _g87 && _cg88 || _g50_e1 && _cg91 || _g57 && _cg92 || _g50 && _cg94;
    _g92 = _g54 || _g53 && !_cg99;
    _g99 = !_g92;
    _g85 = _g36 && _cg97 || _g54_e2;
    _g100 = (_g89_e1 || _g88) && (_g99 || _g85) && (_g88 || _g85);
    _cg101 = _region1_c2_stop || _region1_c2_stop;
    _g89_e1 = _g25 && _cg83 || _g100 && _cg101;
    _g98 = _g33 || _g89_e1 && !_region1_c2_stop;
    if (_g98) {
      _UseCase1_local__Atrig2 = false;
    }
    _g98_e2 = _pg66;
    _g89 = _pg70;
    _g65 = _g98 || _g98_e2 && !_region1_c2_stop || _g89 && !_region1_c2_stop;
    _cg65 = _UseCase1_local_x1 < 2.0;
    _g66 = _g65 && _cg65;
    if (_g66) {
      sleepT = (sleepT < (2.0 - _UseCase1_local_x1)) ? sleepT : (2.0 - _UseCase1_local_x1);
    }
    _g75 = _pg77;
    _g77 = _g75 && !_region1_c2_stop;
    _cg77 = _UseCase1_local_x1 >= 2;
    _g78 = _g77 && _cg77;
    if (_g78) {
      _UseCase1_local__Atrig2 = true;
    }
    _cg66 = _UseCase1_local__Atrig2;
    _g65 = _g65 && !_cg65;
    _cg70 = _UseCase1_local__Atrig2;
    _g67 = _g66 && _cg66 || _g98_e2 && _region1_c2_stop || _g65 && _cg70 || _g89 && _region1_c2_stop;
    _g66 = _g66 && !_cg66;
    _g70 = _g65 && !_cg70;
    _g77 = _g98 || _g77 && !_cg77;
    _g63 = _g75 && _region1_c2_stop || _g78;
    _g78 = !(_g70 || _g66);
    _g76_e2 = !_g77;
    _g76_e2 = (_g78 || _g67) && (_g76_e2 || _g63) && (_g67 || _g63);
    _g76 = _g76_e2 && _region1_c2_stop || _g89_e1 && _region1_c2_stop;
    _g67_e1 = _pg67;
    _g67 = _g33 || _g67_e1 && !_region1_c2_stop;
    if (_g67) {
      _UseCase1_local_Remind_Nurse1 = false;
    }
    _g84 = _g76_e2 && !_region1_c2_stop;
    if (_g84) {
      _UseCase1_local_Remind_Nurse1 |= true;
    }
    _g79 = _g100 && !_cg101;
    if (_g79) {
      _UseCase1_local_Remind_Nurse1 |= true;
    }
    _g101 = _g84 || _g79;
    _g102 = _g33 || _g47;
    _g81 = _g14 && _region1_c2_stop;
    _g107 = !(_g75 || _g89 || _g98_e2 || _g25 || _g36 || _g50 || _g50_e1);
    _g60 = !_g14;
    _g106_e2 = (_g107 || _g76) && (_g60 || _g81) && (_g76 || _g81);
    _g80_e1 = _g67_e1 && _region1_c2_stop;
    _g80 = !(_g14 || _g75 || _g89 || _g98_e2 || _g25 || _g36 || _g50 || _g50_e1);
    _g106 = !_g67_e1;
    _g105 = (_g80 || _g106_e2) && (_g106 || _g80_e1) && (_g106_e2 || _g80_e1);
    _g69 = _g105 || _g11 && !_region1_c2_start;
  }

  public void tick() {
    logic();

    _pg39 = _g39;
    _pg43 = _g43;
    _pg44 = _g44;
    _pg30 = _g30;
    _pg32 = _g32;
    _pg35 = _g35;
    _pg8 = _g8;
    _pg12 = _g12;
    _pg19 = _g19;
    _pg18_e2 = _g18_e2;
    _pg69 = _g69;
    _pg101 = _g101;
    _pg102 = _g102;
    _pg92 = _g92;
    _pg90 = _g90;
    _pg93 = _g93;
    _pg66 = _g66;
    _pg70 = _g70;
    _pg77 = _g77;
    _pg67 = _g67;
    _GO = false;
  }
}
